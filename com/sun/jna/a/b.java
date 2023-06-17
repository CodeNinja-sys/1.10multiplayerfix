/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import com.sun.jna.a.a;
import java.io.File;
import java.util.EventObject;

public class b
extends EventObject {
    private final File b;
    private final int c;
    final /* synthetic */ a a;

    public b(a a2, File file, int n2) {
        this.a = a2;
        super(a2);
        this.b = file;
        this.c = n2;
    }

    public File a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public String toString() {
        return "FileEvent: " + this.b + ":" + this.c;
    }
}

