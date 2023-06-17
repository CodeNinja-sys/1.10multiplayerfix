/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.awt.Canvas;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.opengl.ds;
import org.lwjgl.opengl.ek;
import org.lwjgl.opengl.gc;
import org.lwjgl.opengl.ii;

interface eg
extends gc {
    public void a(ek var1, DisplayMode var2, Canvas var3, int var4, int var5);

    public void a();

    public void a(DisplayMode var1);

    public void b();

    public int c();

    public void setGammaRamp(FloatBuffer var1);

    public String d();

    public String e();

    public DisplayMode f();

    public void a(String var1);

    public boolean g();

    public boolean h();

    public boolean i();

    public boolean j();

    public ii a(PixelFormat var1, ds var2);

    public void k();

    public void a(int var1, int var2, int var3, int var4);

    public DisplayMode[] getAvailableDisplayModes();

    public int l();

    public boolean a(ii var1);

    public ii a(int var1, int var2, PixelFormat var3, ds var4, IntBuffer var5, IntBuffer var6);

    public void a(ii var1, int var2, int var3);

    public void a(ii var1, int var2);

    public void b(ii var1, int var2);

    public int a(ByteBuffer[] var1);

    public void a(boolean var1);

    public boolean m();

    public int n();

    public int o();

    public int p();

    public int q();

    public float r();
}

