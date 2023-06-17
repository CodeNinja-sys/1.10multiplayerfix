/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.IntBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import org.lwjgl.BufferUtils;
import org.lwjgl.d;

public final class ds {
    public static final int a = 8337;
    public static final int b = 8338;
    public static final int c = 37158;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 4;
    public static final int g = 8340;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 4;
    public static final int k = 8;
    public static final int l = 33366;
    public static final int m = 33377;
    public static final int n = 33362;
    public static final int o = 8343;
    public static final int p = 0;
    public static final int q = 8344;
    public static final int r = 8339;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w = 33377;
    private int x = 8344;
    private int y;

    public ds() {
        this(1, 0);
    }

    public ds(int n2, int n3) {
        this(n2, n3, 0, 0);
    }

    public ds(int n2, int n3, int n4) {
        this(n2, n3, 0, n4);
    }

    public ds(int n2, int n3, int n4, int n5) {
        if (n2 < 0 || 4 < n2 || n3 < 0 || n2 == 4 && 5 < n3 || n2 == 3 && 3 < n3 || n2 == 2 && 1 < n3 || n2 == 1 && 5 < n3) {
            throw new IllegalArgumentException("Invalid OpenGL version specified: " + n2 + '.' + n3);
        }
        if (org.lwjgl.d.j) {
            if (1 < Integer.bitCount(n4) || 4 < n4) {
                throw new IllegalArgumentException("Invalid profile mask specified: " + Integer.toBinaryString(n4));
            }
            if (15 < n5) {
                throw new IllegalArgumentException("Invalid context flags specified: " + Integer.toBinaryString(n4));
            }
        }
        this.s = n2;
        this.t = n3;
        this.u = n4;
        this.v = n5;
    }

    private ds(ds ds2) {
        this.s = ds2.s;
        this.t = ds2.t;
        this.u = ds2.u;
        this.v = ds2.v;
        this.w = ds2.w;
        this.x = ds2.x;
        this.y = ds2.y;
    }

    public int a() {
        return this.s;
    }

    public int b() {
        return this.t;
    }

    public int c() {
        return this.u;
    }

    private boolean d(int n2) {
        return this.u == n2;
    }

    public boolean d() {
        return this.d(1);
    }

    public boolean e() {
        return this.d(2);
    }

    public boolean f() {
        return this.d(4);
    }

    public int g() {
        return this.v;
    }

    private boolean e(int n2) {
        return (this.v & n2) != 0;
    }

    public boolean h() {
        return this.e(1);
    }

    public boolean i() {
        return this.e(2);
    }

    public boolean j() {
        return this.e(4);
    }

    public boolean k() {
        return this.e(8);
    }

    public int l() {
        return this.w;
    }

    public boolean m() {
        return this.w == 33362;
    }

    public int n() {
        return this.x;
    }

    public int o() {
        return this.y;
    }

    private ds a(int n2, boolean bl2) {
        if (bl2 == this.d(n2)) {
            return this;
        }
        ds ds2 = new ds(this);
        ds2.u = bl2 ? n2 : 0;
        return ds2;
    }

    public ds a(boolean bl2) {
        if (this.s < 3 || this.s == 3 && this.t < 2) {
            throw new IllegalArgumentException("Profiles are only supported on OpenGL version 3.2 or higher.");
        }
        return this.a(1, bl2);
    }

    public ds b(boolean bl2) {
        if (this.s < 3 || this.s == 3 && this.t < 2) {
            throw new IllegalArgumentException("Profiles are only supported on OpenGL version 3.2 or higher.");
        }
        return this.a(2, bl2);
    }

    public ds c(boolean bl2) {
        if (this.s != 2 || this.t != 0) {
            throw new IllegalArgumentException("The OpenGL ES profile is only supported on OpenGL version 2.0.");
        }
        return this.a(4, bl2);
    }

    private ds b(int n2, boolean bl2) {
        if (bl2 == this.e(n2)) {
            return this;
        }
        ds ds2 = new ds(this);
        ds2.v ^= n2;
        return ds2;
    }

    public ds d(boolean bl2) {
        return this.b(1, bl2);
    }

    public ds e(boolean bl2) {
        return this.b(2, bl2);
    }

    public ds f(boolean bl2) {
        return this.b(4, bl2);
    }

    public ds g(boolean bl2) {
        return this.b(8, bl2);
    }

    public ds a(int n2) {
        if (n2 == this.w) {
            return this;
        }
        if (org.lwjgl.d.j && n2 != 33377 && n2 != 33362) {
            throw new IllegalArgumentException("Invalid context reset notification strategy specified: 0x" + org.lwjgl.d.a(n2));
        }
        ds ds2 = new ds(this);
        ds2.w = n2;
        return ds2;
    }

    public ds h(boolean bl2) {
        return this.a(bl2 ? 33362 : 33377);
    }

    public ds b(int n2) {
        if (n2 == this.x) {
            return this;
        }
        if (org.lwjgl.d.j && n2 != 8344 && n2 != 0) {
            throw new IllegalArgumentException("Invalid context release behavior specified: 0x" + org.lwjgl.d.a(n2));
        }
        ds ds2 = new ds(this);
        ds2.x = n2;
        return ds2;
    }

    public ds c(int n2) {
        if (org.lwjgl.d.a() != 3) {
            throw new IllegalArgumentException("The CONTEXT_LAYER_PLANE_ARB attribute is supported only on the Windows platform.");
        }
        if (n2 == this.y) {
            return this;
        }
        if (n2 < 0) {
            throw new IllegalArgumentException("Invalid layer plane specified: " + n2);
        }
        ds ds2 = new ds(this);
        ds2.y = n2;
        return ds2;
    }

    IntBuffer p() {
        if (org.lwjgl.d.a() == 2) {
            return null;
        }
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<Integer, Integer>(8);
        if (this.s != 1 || this.t != 0) {
            linkedHashMap.put(8337, this.s);
            linkedHashMap.put(8338, this.t);
        }
        if (this.v != 0) {
            linkedHashMap.put(8340, this.v);
        }
        if (this.u != 0) {
            linkedHashMap.put(37158, this.u);
        }
        if (this.w != 33377) {
            linkedHashMap.put(33366, this.w);
        }
        if (this.x != 8344) {
            linkedHashMap.put(8343, this.x);
        }
        if (this.y != 0) {
            linkedHashMap.put(8339, this.y);
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        IntBuffer intBuffer = BufferUtils.d(linkedHashMap.size() * 2 + 1);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            intBuffer.put((Integer)entry.getKey()).put((Integer)entry.getValue());
        }
        intBuffer.put(0);
        intBuffer.rewind();
        return intBuffer;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append("ContextAttribs:");
        stringBuilder.append(" Version=").append(this.s).append('.').append(this.t);
        if (this.u != 0) {
            stringBuilder.append(", Profile=");
            if (this.d(1)) {
                stringBuilder.append("CORE");
            } else if (this.d(2)) {
                stringBuilder.append("COMPATIBLITY");
            } else if (this.d(4)) {
                stringBuilder.append("ES2");
            } else {
                stringBuilder.append("*unknown*");
            }
        }
        if (this.v != 0) {
            if (this.e(1)) {
                stringBuilder.append(", DEBUG");
            }
            if (this.e(2)) {
                stringBuilder.append(", FORWARD_COMPATIBLE");
            }
            if (this.e(4)) {
                stringBuilder.append(", ROBUST_ACCESS");
            }
            if (this.e(8)) {
                stringBuilder.append(", RESET_ISOLATION");
            }
        }
        if (this.w != 33377) {
            stringBuilder.append(", LOSE_CONTEXT_ON_RESET");
        }
        if (this.x != 8344) {
            stringBuilder.append(", RELEASE_BEHAVIOR_NONE");
        }
        if (this.y != 0) {
            stringBuilder.append(", Layer=").append(this.y);
        }
        return stringBuilder.toString();
    }
}

