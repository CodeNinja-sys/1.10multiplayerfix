/*
 * Decompiled with CFR 0.150.
 */
public class bif {
    public static final bif[] a = new bif[64];
    public static final bif b = new bif(0, 0);
    public static final bif c = new bif(1, 8368696);
    public static final bif d = new bif(2, 16247203);
    public static final bif e = new bif(3, 0xC7C7C7);
    public static final bif f = new bif(4, 0xFF0000);
    public static final bif g = new bif(5, 0xA0A0FF);
    public static final bif h = new bif(6, 0xA7A7A7);
    public static final bif i = new bif(7, 31744);
    public static final bif j = new bif(8, 0xFFFFFF);
    public static final bif k = new bif(9, 10791096);
    public static final bif l = new bif(10, 9923917);
    public static final bif m = new bif(11, 0x707070);
    public static final bif n = new bif(12, 0x4040FF);
    public static final bif o = new bif(13, 9402184);
    public static final bif p = new bif(14, 0xFFFCF5);
    public static final bif q = new bif(15, 14188339);
    public static final bif r = new bif(16, 11685080);
    public static final bif s = new bif(17, 6724056);
    public static final bif t = new bif(18, 0xE5E533);
    public static final bif u = new bif(19, 8375321);
    public static final bif v = new bif(20, 15892389);
    public static final bif w = new bif(21, 0x4C4C4C);
    public static final bif x = new bif(22, 0x999999);
    public static final bif y = new bif(23, 5013401);
    public static final bif z = new bif(24, 8339378);
    public static final bif A = new bif(25, 3361970);
    public static final bif B = new bif(26, 6704179);
    public static final bif C = new bif(27, 6717235);
    public static final bif D = new bif(28, 0x993333);
    public static final bif E = new bif(29, 0x191919);
    public static final bif F = new bif(30, 16445005);
    public static final bif G = new bif(31, 6085589);
    public static final bif H = new bif(32, 4882687);
    public static final bif I = new bif(33, 55610);
    public static final bif J = new bif(34, 8476209);
    public static final bif K = new bif(35, 0x700200);
    public final int L;
    public final int M;

    private bif(int n2, int n3) {
        if (n2 < 0 || n2 > 63) {
            throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
        }
        this.M = n2;
        this.L = n3;
        bif.a[n2] = this;
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

