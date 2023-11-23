<%@ page import="com.servlet.practice.domain.member.MemberRepository" %>
<%@ page import="com.servlet.practice.domain.member.Member" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%

        // request, response 使用可能
        MemberRepository memberRepository = MemberRepository.getInstance();
        System.out.println("save.jsp");
        String username = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));
        Member member = new Member(username, age);
        System.out.println("member = " + member);
        memberRepository.save(member);
%>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>
成功
<ul>
    <li>id=<%=member.getId()%></li>
    <li>username=<%=member.getUsername()%></li>
    <li>age=<%=member.getAge()%></li>
</ul>
<a href="/index.html">メイン</a>
</body>
</html>
