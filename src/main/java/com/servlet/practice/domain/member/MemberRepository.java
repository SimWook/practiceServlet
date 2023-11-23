package com.servlet.practice.domain.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 同時実行性の問題が考慮されていないため、実務ではConcurrentHashMapやAtomicLongの使用を検討する必要があります。
 */
public class MemberRepository {
    private static Map<Long, Member> store = new HashMap<>(); //static 使用
    private static long sequence = 0L; //static 使用
    private static final MemberRepository instance = new MemberRepository();

    public static MemberRepository getInstance() {
        return instance;
    }

    private MemberRepository() {
    }

    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    public Member findById(Long id) {
        return store.get(id);
    }

    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();
    }
}
