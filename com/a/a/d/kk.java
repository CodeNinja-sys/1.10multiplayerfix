/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import com.a.a.d.an;
import com.a.a.d.iz;
import com.a.a.d.jr;
import com.a.a.d.jt;
import com.a.a.d.kl;
import com.a.a.d.km;
import com.a.a.d.kn;
import com.a.a.d.kp;
import com.a.a.d.ks;
import com.a.a.d.kt;
import com.a.a.d.ku;
import com.a.a.d.lo;
import com.a.a.d.vi;
import com.a.a.d.xc;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class kk
extends an
implements Serializable {
    final transient jt b;
    final transient int c;
    private static final long a = 0L;

    public static kk f() {
        return jr.a();
    }

    public static kk e(Object object, Object object2) {
        return jr.d(object, object2);
    }

    public static kk b(Object object, Object object2, Object object3, Object object4) {
        return jr.a(object, object2, object3, object4);
    }

    public static kk b(Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
        return jr.a(object, object2, object3, object4, object5, object6);
    }

    public static kk b(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
        return jr.a(object, object2, object3, object4, object5, object6, object7, object8);
    }

    public static kk b(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
        return jr.a(object, object2, object3, object4, object5, object6, object7, object8, object9, object10);
    }

    public static kn v() {
        return new kn();
    }

    public static kk c(vi vi2) {
        kk kk2;
        if (vi2 instanceof kk && !(kk2 = (kk)vi2).w()) {
            return kk2;
        }
        return jr.b(vi2);
    }

    kk(jt jt2, int n2) {
        this.b = jt2;
        this.c = n2;
    }

    public iz j(Object object) {
        throw new UnsupportedOperationException();
    }

    public iz e(Object object, Iterable iterable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void h() {
        throw new UnsupportedOperationException();
    }

    public abstract iz i(Object var1);

    public abstract kk e();

    @Override
    public boolean a(Object object, Object object2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean c(Object object, Iterable iterable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean a(vi vi2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean c(Object object, Object object2) {
        throw new UnsupportedOperationException();
    }

    boolean w() {
        return this.b.b();
    }

    @Override
    public boolean f(Object object) {
        return this.b.containsKey(object);
    }

    @Override
    public boolean g(Object object) {
        return object != null && super.g(object);
    }

    @Override
    public int g() {
        return this.c;
    }

    public lo x() {
        return this.b.g();
    }

    public jt y() {
        return this.b;
    }

    @Override
    Map n() {
        throw new AssertionError((Object)"should never be called");
    }

    public iz z() {
        return (iz)super.l();
    }

    iz A() {
        return new kp(this);
    }

    agi B() {
        return new kl(this);
    }

    public ku C() {
        return (ku)super.r();
    }

    ku D() {
        return new ks(this);
    }

    public iz E() {
        return (iz)super.j();
    }

    iz F() {
        return new kt(this);
    }

    agi G() {
        return new km(this);
    }

    @Override
    public /* synthetic */ Map c() {
        return this.y();
    }

    @Override
    /* synthetic */ Iterator k() {
        return this.G();
    }

    @Override
    /* synthetic */ Collection t() {
        return this.F();
    }

    @Override
    public /* synthetic */ Collection j() {
        return this.E();
    }

    @Override
    /* synthetic */ xc s() {
        return this.D();
    }

    @Override
    public /* synthetic */ xc r() {
        return this.C();
    }

    @Override
    public /* synthetic */ Set q() {
        return this.x();
    }

    @Override
    /* synthetic */ Iterator m() {
        return this.B();
    }

    @Override
    /* synthetic */ Collection p() {
        return this.A();
    }

    @Override
    public /* synthetic */ Collection l() {
        return this.z();
    }

    @Override
    public /* synthetic */ Collection b(Object object, Iterable iterable) {
        return this.e(object, iterable);
    }

    @Override
    public /* synthetic */ Collection c(Object object) {
        return this.i(object);
    }

    @Override
    public /* synthetic */ Collection d(Object object) {
        return this.j(object);
    }
}

