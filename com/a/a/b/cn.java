/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.bl;
import com.a.a.b.bx;
import com.a.a.b.cl;
import com.a.a.b.cm;
import com.a.a.b.cp;
import com.a.a.b.cq;
import com.a.a.b.cr;
import com.a.a.b.cs;
import com.a.a.b.ct;
import com.a.a.b.cu;
import com.a.a.b.cv;
import com.a.a.b.cw;
import com.a.a.b.cx;
import com.a.a.b.cy;
import com.a.a.b.dd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

public final class cn {
    private static final bx a = bx.a(',');

    private cn() {
    }

    public static cm a() {
        return cy.a.a();
    }

    public static cm b() {
        return cy.b.a();
    }

    public static cm c() {
        return cy.c.a();
    }

    public static cm d() {
        return cy.d.a();
    }

    public static cm a(cm cm2) {
        return new cx(cm2);
    }

    public static cm a(Iterable iterable) {
        return new cp(cn.c(iterable), null);
    }

    public static cm a(cm ... arrcm) {
        return new cp(cn.a((Object[])arrcm), null);
    }

    public static cm a(cm cm2, cm cm3) {
        return new cp(cn.c((cm)cl.a(cm2), (cm)cl.a(cm3)), null);
    }

    public static cm b(Iterable iterable) {
        return new dd(cn.c(iterable), null);
    }

    public static cm b(cm ... arrcm) {
        return new dd(cn.a((Object[])arrcm), null);
    }

    public static cm b(cm cm2, cm cm3) {
        return new dd(cn.c((cm)cl.a(cm2), (cm)cl.a(cm3)), null);
    }

    public static cm a(Object object) {
        return object == null ? cn.c() : new cw(object, null);
    }

    public static cm a(Class class_) {
        return new cv(class_, null);
    }

    public static cm b(Class class_) {
        return new cq(class_, null);
    }

    public static cm a(Collection collection) {
        return new cu(collection, null);
    }

    public static cm a(cm cm2, bl bl2) {
        return new cr(cm2, bl2, null);
    }

    public static cm a(String string) {
        return new cs(string);
    }

    public static cm a(Pattern pattern) {
        return new ct(pattern);
    }

    private static List c(cm cm2, cm cm3) {
        return Arrays.asList(cm2, cm3);
    }

    private static List a(Object ... arrobject) {
        return cn.c(Arrays.asList(arrobject));
    }

    static List c(Iterable iterable) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (Object t2 : iterable) {
            arrayList.add(cl.a(t2));
        }
        return arrayList;
    }

    static /* synthetic */ bx e() {
        return a;
    }
}

