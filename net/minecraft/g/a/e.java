/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g.a;

public class e {
    public static final e[] a = new e[64];
    public static final e b = new e(0, 0);
    public static final e c = new e(1, 8368696);
    public static final e d = new e(2, 16247203);
    public static final e e = new e(3, 0xC7C7C7);
    public static final e f = new e(4, 0xFF0000);
    public static final e g = new e(5, 0xA0A0FF);
    public static final e h = new e(6, 0xA7A7A7);
    public static final e i = new e(7, 31744);
    public static final e j = new e(8, 0xFFFFFF);
    public static final e k = new e(9, 10791096);
    public static final e l = new e(10, 9923917);
    public static final e m = new e(11, 0x707070);
    public static final e n = new e(12, 0x4040FF);
    public static final e o = new e(13, 9402184);
    public static final e p = new e(14, 0xFFFCF5);
    public static final e q = new e(15, 14188339);
    public static final e r = new e(16, 11685080);
    public static final e s = new e(17, 6724056);
    public static final e t = new e(18, 0xE5E533);
    public static final e u = new e(19, 8375321);
    public static final e v = new e(20, 15892389);
    public static final e w = new e(21, 0x4C4C4C);
    public static final e x = new e(22, 0x999999);
    public static final e y = new e(23, 5013401);
    public static final e z = new e(24, 8339378);
    public static final e A = new e(25, 3361970);
    public static final e B = new e(26, 6704179);
    public static final e C = new e(27, 6717235);
    public static final e D = new e(28, 0x993333);
    public static final e E = new e(29, 0x191919);
    public static final e F = new e(30, 16445005);
    public static final e G = new e(31, 6085589);
    public static final e H = new e(32, 4882687);
    public static final e I = new e(33, 55610);
    public static final e J = new e(34, 8476209);
    public static final e K = new e(35, 0x700200);
    public final int L;
    public final int M;

    private e(int n2, int n3) {
        if (n2 < 0 || n2 > 63) {
            throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
        }
        this.M = n2;
        this.L = n3;
        net.minecraft.g.a.e.a[n2] = this;
    }

    public int a(int n2) {
        int n3 = 220;
        if (n2 == 3) {
            n3 = 135;
        }
        if (n2 == 2) {
            n3 = 255;
        }
        if (n2 == 1) {
            n3 = 220;
        }
        if (n2 == 0) {
            n3 = 180;
        }
        int n4 = (this.L >> 16 & 0xFF) * n3 / 255;
        int n5 = (this.L >> 8 & 0xFF) * n3 / 255;
        int n6 = (this.L & 0xFF) * n3 / 255;
        return 0xFF000000 | n4 << 16 | n5 << 8 | n6;
    }
}

