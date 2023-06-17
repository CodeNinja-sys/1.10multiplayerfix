/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.abn;
import com.a.a.d.ce;
import com.a.a.d.ma;
import com.a.a.d.me;
import com.a.a.d.xd;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

final class el
extends ma {
    private final transient ma b;

    el(ma ma2) {
        this.b = ma2;
    }

    @Override
    public int a(Object object) {
        return this.b.a(object);
    }

    @Override
    public xd i() {
        return this.b.j();
    }

    @Override
    public xd j() {
        return this.b.i();
    }

    @Override
    public int size() {
        return this.b.size();
    }

    @Override
    public me b() {
        return this.b.b().aP_();
    }

    @Override
    xd a(int n2) {
        return (xd)this.b.n().h().f().get(n2);
    }

    @Override
    public ma e() {
        return this.b;
    }

    @Override
    public ma a(Object object, ce ce2) {
        return this.b.b(object, ce2).e();
    }

    @Override
    public ma b(Object object, ce ce2) {
        return this.b.a(object, ce2).e();
    }

    @Override
    boolean a() {
        return this.b.a();
    }

    @Override
    public /* synthetic */ abn c(Object object, ce ce2) {
        return this.b(object, ce2);
    }

    @Override
    public /* synthetic */ abn d(Object object, ce ce2) {
        return this.a(object, ce2);
    }

    @Override
    public /* synthetic */ abn o() {
        return this.e();
    }

    @Override
    public /* synthetic */ NavigableSet g() {
        return this.b();
    }

    @Override
    public /* synthetic */ SortedSet q() {
        return this.b();
    }

    @Override
    public /* synthetic */ Set d() {
        return this.b();
    }
}

