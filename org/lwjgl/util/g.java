/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util;

import java.nio.ByteBuffer;
import org.lwjgl.util.a;

public interface g {
    public static final g b = new a(255, 0, 0);
    public static final g c = new a(255, 128, 0);
    public static final g d = new a(255, 255, 0);
    public static final g e = new a(0, 255, 0);
    public static final g f = new a(0, 255, 255);
    public static final g g = new a(0, 0, 255);
    public static final g h = new a(255, 0, 255);
    public static final g i = new a(255, 255, 255);
    public static final g j = new a(0, 0, 0);
    public static final g k = new a(192, 192, 192);
    public static final g l = new a(64, 64, 64);
    public static final g m = new a(128, 128, 128);

    public int a();

    public int b();

    public int c();

    public int d();

    public byte h();

    public byte g();

    public byte f();

    public byte e();

    public void a(ByteBuffer var1);

    public void b(ByteBuffer var1);

    public void c(ByteBuffer var1);

    public void e(ByteBuffer var1);

    public void f(ByteBuffer var1);

    public void d(ByteBuffer var1);
}

