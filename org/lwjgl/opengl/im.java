/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;

public final class im {
    private static final int t = 8304;
    private static final int u = 8305;
    private static final int v = 8306;
    private static final int w = 8307;
    private static final int x = 8308;
    private static final int y = 8309;
    private static final int z = 8310;
    private static final int A = 8312;
    private static final int B = 8313;
    private static final int C = 8314;
    private static final int D = 8311;
    static final int a = 8315;
    static final int b = 8316;
    static final int c = 8317;
    static final int d = 8318;
    static final int e = 8319;
    static final int f = 8320;
    static final int g = 8321;
    static final int h = 8322;
    static final int i = 8323;
    static final int j = 8324;
    static final int k = 8325;
    static final int l = 8326;
    private static final int E = 8352;
    private static final int F = 8353;
    private static final int G = 8354;
    private static final int H = 8355;
    private static final int I = 8356;
    private static final int J = 8357;
    private static final int K = 8358;
    static final int m = 8359;
    public static final int n = 8313;
    public static final int o = 8314;
    public static final int p = 8354;
    public static final int q = 8312;
    IntBuffer r;
    IntBuffer s;

    public im(boolean bl2, boolean bl3, boolean bl4, boolean bl5, int n2, int n3) {
        if (bl2 && bl3) {
            throw new IllegalArgumentException("A RenderTexture can't be both RGB and RGBA.");
        }
        if (n3 < 0) {
            throw new IllegalArgumentException("The mipmap levels can't be negative.");
        }
        if (bl5 && n2 != 8354) {
            throw new IllegalArgumentException("When the RenderTexture is rectangle the target must be RENDER_TEXTURE_RECTANGLE.");
        }
        this.r = BufferUtils.d(4);
        this.s = BufferUtils.d(8);
        if (bl2) {
            this.r.put(bl5 ? 8352 : 8304);
            this.r.put(1);
            this.s.put(8306);
            this.s.put(8309);
        } else if (bl3) {
            this.r.put(bl5 ? 8353 : 8305);
            this.r.put(1);
            this.s.put(8306);
            this.s.put(8310);
        }
        if (bl4) {
            this.r.put(bl5 ? 8356 : 8355);
            this.r.put(1);
            this.s.put(8357);
            this.s.put(8358);
        }
        this.s.put(8307);
        this.s.put(n2);
        if (n3 != 0) {
            this.s.put(8308);
            this.s.put(n3);
        }
        this.r.flip();
        this.s.flip();
    }
}

