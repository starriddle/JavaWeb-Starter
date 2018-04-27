package com.cyl.demo.feign.server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author CYL
 * @date 2018-04-25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Org {

    /**
     * org id
     */
    private long id;
    /**
     * org name
     */
    private String name;
    /**
     * org address
     */
    private String address;
}
