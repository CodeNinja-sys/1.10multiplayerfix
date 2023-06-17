/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.a;

enum k {
    a("us-east-1", "ec2.us-east-1.amazonaws.com"),
    b("us-west-2", "ec2.us-west-2.amazonaws.com"),
    c("us-west-1", "ec2.us-west-1.amazonaws.com"),
    d("eu-west-1", "ec2.eu-west-1.amazonaws.com"),
    e("ap-southeast-1", "ec2.ap-southeast-1.amazonaws.com"),
    f("ap-southeast-2", "ec2.ap-southeast-2.amazonaws.com"),
    g("ap-northeast-1", "ec2.ap-northeast-1.amazonaws.com"),
    h("sa-east-1", "ec2.sa-east-1.amazonaws.com");

    private final String i;
    private final String j;

    /*
     * WARNING - void declaration
     */
    private k() {
        void var4_2;
        void var3_1;
        this.i = var3_1;
        this.j = var4_2;
    }

    static /* synthetic */ String a(k k2) {
        return k2.j;
    }

    static /* synthetic */ String b(k k2) {
        return k2.i;
    }
}

