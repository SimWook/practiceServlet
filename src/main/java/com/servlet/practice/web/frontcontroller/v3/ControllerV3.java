package com.servlet.practice.web.frontcontroller.v3;

import com.servlet.practice.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {
    ModelView process(Map<String, String> paramMap);
}
