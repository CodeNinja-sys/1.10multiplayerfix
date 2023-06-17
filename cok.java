/*
 * Decompiled with CFR 0.150.
 */
public enum cok {
    a,
    b,
    c;


    public static cok a(int n2) {
        if (n2 < 0 || n2 > cok.values().length) {
            n2 = 0;
        }
        return cok.values()[n2];
    }
}

