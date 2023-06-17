/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.adv;
import com.a.a.d.hg;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class hr
extends hg
implements adv {
    protected hr() {
    }

    protected abstract adv f();

    @Override
    public Set e() {
        return this.f().e();
    }

    @Override
    public void d() {
        this.f().d();
    }

    @Override
    public Map d(Object object) {
        return this.f().d(object);
    }

    @Override
    public Set b() {
        return this.f().b();
    }

    @Override
    public Map p() {
        return this.f().p();
    }

    @Override
    public boolean a(Object object, Object object2) {
        return this.f().a(object, object2);
    }

    @Override
    public boolean b(Object object) {
        return this.f().b(object);
    }

    @Override
    public boolean a(Object object) {
        return this.f().a(object);
    }

    @Override
    public boolean c(Object object) {
        return this.f().c(object);
    }

    @Override
    public Object b(Object object, Object object2) {
        return this.f().b(object, object2);
    }

    @Override
    public boolean c() {
        return this.f().c();
    }

    @Override
    public Object a(Object object, Object object2, Object object3) {
        return this.f().a(object, object2, object3);
    }

    @Override
    public void a(adv adv2) {
        this.f().a(adv2);
    }

    @Override
    public Object c(Object object, Object object2) {
        return this.f().c(object, object2);
    }

    @Override
    public Map e(Object object) {
        return this.f().e(object);
    }

    @Override
    public Set a() {
        return this.f().a();
    }

    @Override
    public Map r() {
        return this.f().r();
    }

    @Override
    public int n() {
        return this.f().n();
    }

    @Override
    public Collection h() {
        return this.f().h();
    }

    @Override
    public boolean equals(Object object) {
        return object == this || this.f().equals(object);
    }

    @Override
    public int hashCode() {
        return this.f().hashCode();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.f();
    }
}

