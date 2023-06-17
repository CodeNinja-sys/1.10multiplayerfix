/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

public enum fp {
    a(new String[]{"LONG", "SHORT"}),
    b(new String[0]),
    c(new String[0]);

    String[] d;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private fp() {
        void var3_1;
        this.d = var3_1;
    }

    public boolean a(fp fp2) {
        String string = fp2.toString();
        for (String string2 : this.d) {
            if (!string2.equals(string)) continue;
            return true;
        }
        return false;
    }
}

