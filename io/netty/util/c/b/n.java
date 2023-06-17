/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 */
package io.netty.util.c.b;

import io.netty.util.c.b.a;
import org.slf4j.Logger;

class n
extends a {
    private static final long a = 108038972685130825L;
    private final transient Logger b;

    n(Logger logger) {
        super(logger.getName());
        this.b = logger;
    }

    @Override
    public boolean c() {
        return this.b.isTraceEnabled();
    }

    @Override
    public void a(String string) {
        this.b.trace(string);
    }

    @Override
    public void a(String string, Object object) {
        this.b.trace(string, object);
    }

    @Override
    public void a(String string, Object object, Object object2) {
        this.b.trace(string, object, object2);
    }

    @Override
    public void a(String string, Object ... arrobject) {
        this.b.trace(string, arrobject);
    }

    @Override
    public void a(String string, Throwable throwable) {
        this.b.trace(string, throwable);
    }

    @Override
    public boolean d() {
        return this.b.isDebugEnabled();
    }

    @Override
    public void b(String string) {
        this.b.debug(string);
    }

    @Override
    public void b(String string, Object object) {
        this.b.debug(string, object);
    }

    @Override
    public void b(String string, Object object, Object object2) {
        this.b.debug(string, object, object2);
    }

    @Override
    public void b(String string, Object ... arrobject) {
        this.b.debug(string, arrobject);
    }

    @Override
    public void b(String string, Throwable throwable) {
        this.b.debug(string, throwable);
    }

    @Override
    public boolean e() {
        return this.b.isInfoEnabled();
    }

    @Override
    public void c(String string) {
        this.b.info(string);
    }

    @Override
    public void c(String string, Object object) {
        this.b.info(string, object);
    }

    @Override
    public void c(String string, Object object, Object object2) {
        this.b.info(string, object, object2);
    }

    @Override
    public void c(String string, Object ... arrobject) {
        this.b.info(string, arrobject);
    }

    @Override
    public void c(String string, Throwable throwable) {
        this.b.info(string, throwable);
    }

    @Override
    public boolean f() {
        return this.b.isWarnEnabled();
    }

    @Override
    public void d(String string) {
        this.b.warn(string);
    }

    @Override
    public void d(String string, Object object) {
        this.b.warn(string, object);
    }

    @Override
    public void d(String string, Object ... arrobject) {
        this.b.warn(string, arrobject);
    }

    @Override
    public void d(String string, Object object, Object object2) {
        this.b.warn(string, object, object2);
    }

    @Override
    public void d(String string, Throwable throwable) {
        this.b.warn(string, throwable);
    }

    @Override
    public boolean g() {
        return this.b.isErrorEnabled();
    }

    @Override
    public void e(String string) {
        this.b.error(string);
    }

    @Override
    public void e(String string, Object object) {
        this.b.error(string, object);
    }

    @Override
    public void e(String string, Object object, Object object2) {
        this.b.error(string, object, object2);
    }

    @Override
    public void e(String string, Object ... arrobject) {
        this.b.error(string, arrobject);
    }

    @Override
    public void e(String string, Throwable throwable) {
        this.b.error(string, throwable);
    }
}

