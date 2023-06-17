/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.e;

import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import org.apache.a.e.b;
import org.apache.a.e.d;

public class a
implements Cloneable {
    public static final a a = new b().a();
    private final int b;
    private final int c;
    private final Charset d;
    private final CodingErrorAction e;
    private final CodingErrorAction f;
    private final d g;

    a(int n2, int n3, Charset charset, CodingErrorAction codingErrorAction, CodingErrorAction codingErrorAction2, d d2) {
        this.b = n2;
        this.c = n3;
        this.d = charset;
        this.e = codingErrorAction;
        this.f = codingErrorAction2;
        this.g = d2;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public Charset c() {
        return this.d;
    }

    public CodingErrorAction d() {
        return this.e;
    }

    public CodingErrorAction e() {
        return this.f;
    }

    public d f() {
        return this.g;
    }

    protected a g() {
        return (a)super.clone();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[bufferSize=").append(this.b).append(", fragmentSizeHint=").append(this.c).append(", charset=").append(this.d).append(", malformedInputAction=").append(this.e).append(", unmappableInputAction=").append(this.f).append(", messageConstraints=").append(this.g).append("]");
        return stringBuilder.toString();
    }

    public static b h() {
        return new b();
    }

    public static b a(a a2) {
        org.apache.a.o.a.a(a2, "Connection config");
        return new b().a(a2.c()).a(a2.d()).b(a2.e()).a(a2.f());
    }

    protected /* synthetic */ Object clone() {
        return this.g();
    }
}

