/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

public enum dt {
    a("java.version"),
    b("java.vendor"),
    c("java.vendor.url"),
    d("java.home"),
    e("java.vm.specification.version"),
    f("java.vm.specification.vendor"),
    g("java.vm.specification.name"),
    h("java.vm.version"),
    i("java.vm.vendor"),
    j("java.vm.name"),
    k("java.specification.version"),
    l("java.specification.vendor"),
    m("java.specification.name"),
    n("java.class.version"),
    o("java.class.path"),
    p("java.library.path"),
    q("java.io.tmpdir"),
    r("java.compiler"),
    s("java.ext.dirs"),
    t("os.name"),
    u("os.arch"),
    v("os.version"),
    w("file.separator"),
    x("path.separator"),
    y("line.separator"),
    z("user.name"),
    A("user.home"),
    B("user.dir");

    private final String C;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dt() {
        void var3_1;
        this.C = var3_1;
    }

    public String a() {
        return this.C;
    }

    public String b() {
        return System.getProperty(this.C);
    }

    public String toString() {
        return this.a() + "=" + this.b();
    }
}

