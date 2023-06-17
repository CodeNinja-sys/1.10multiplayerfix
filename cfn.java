/*
 * Decompiled with CFR 0.150.
 */
public enum cfn {
    a,
    b;


    public static cfn a(int n2) {
        if (n2 < 0 || n2 >= cfn.values().length) {
            return a;
        }
        return cfn.values()[n2];
    }
}

