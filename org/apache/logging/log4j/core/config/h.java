/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.config;

import java.io.File;
import java.io.InputStream;

public class h {
    private File a;
    private String b;
    private InputStream c;

    public h() {
    }

    public h(InputStream inputStream) {
        this.c = inputStream;
        this.a = null;
        this.b = null;
    }

    public h(InputStream inputStream, File file) {
        this.c = inputStream;
        this.a = file;
        this.b = file.getAbsolutePath();
    }

    public h(InputStream inputStream, String string) {
        this.c = inputStream;
        this.b = string;
        this.a = null;
    }

    public File a() {
        return this.a;
    }

    public void a(File file) {
        this.a = file;
    }

    public String b() {
        return this.b;
    }

    public void a(String string) {
        this.b = string;
    }

    public InputStream c() {
        return this.c;
    }

    public void a(InputStream inputStream) {
        this.c = inputStream;
    }
}

