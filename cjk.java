/*
 * Decompiled with CFR 0.150.
 */
public class cjk {
    public static bhl a(bhl[] arrbhl, int n2, int n3) {
        if (n2 < 0 || n2 >= arrbhl.length || arrbhl[n2] == null || n3 <= 0) {
            return null;
        }
        bhl bhl2 = arrbhl[n2].a(n3);
        if (arrbhl[n2].b == 0) {
            arrbhl[n2] = null;
        }
        return bhl2;
    }

    public static bhl a(bhl[] arrbhl, int n2) {
        if (n2 < 0 || n2 >= arrbhl.length) {
            return null;
        }
        bhl bhl2 = arrbhl[n2];
        arrbhl[n2] = null;
        return bhl2;
    }
}

