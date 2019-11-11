package com.typeng.datastructure.tree;

import java.util.List;

/**
 * 树节点.
 *
 * @author ty-peng
 * @since 2019/11/11 17:21
 */
public class Node {
    private String id;
    private String name;
    private String pid;
    private Object data;
    private List<Node> children;

    public String getId() {
        return id;
    }

    public Node setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Node setName(String name) {
        this.name = name;
        return this;
    }

    public String getPid() {
        return pid;
    }

    public Node setPid(String pid) {
        this.pid = pid;
        return this;
    }

    public Object getData() {
        return data;
    }

    public Node setData(Object data) {
        this.data = data;
        return this;
    }

    public List<Node> getChildren() {
        return children;
    }

    public Node setChildren(List<Node> children) {
        this.children = children;
        return this;
    }
}
