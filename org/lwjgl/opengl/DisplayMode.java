/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

public final class DisplayMode {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final boolean e;

    public DisplayMode(int n2, int n3) {
        this(n2, n3, 0, 0, false);
    }

    DisplayMode(int n2, int n3, int n4, int n5) {
        this(n2, n3, n4, n5, true);
    }

    private DisplayMode(int n2, int n3, int n4, int n5, boolean bl2) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = n5;
        this.e = bl2;
    }

    public boolean a() {
        return this.e;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (object == null || !(object instanceof DisplayMode)) {
            return false;
        }
        DisplayMode displayMode = (DisplayMode)object;
        return displayMode.a == this.a && displayMode.b == this.b && displayMode.c == this.c && displayMode.d == this.d;
    }

    public int hashCode() {
        return this.a ^ this.b ^ this.d ^ this.c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append(this.a);
        stringBuilder.append(" x ");
        stringBuilder.append(this.b);
        stringBuilder.append(" x ");
        stringBuilder.append(this.c);
        stringBuilder.append(" @");
        stringBuilder.append(this.d);
        stringBuilder.append("Hz");
        return stringBuilder.toString();
    }
}

