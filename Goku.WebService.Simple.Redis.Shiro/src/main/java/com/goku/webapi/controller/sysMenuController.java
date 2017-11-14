package com.goku.webapi.controller;

import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by nbfujx on 2017/11/7.
 */
public interface sysMenuController {
    String  selectByid(@PathVariable long id);
}
