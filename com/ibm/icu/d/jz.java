/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.b.b;
import com.ibm.icu.d.ds;
import com.ibm.icu.d.dt;
import com.ibm.icu.d.eg;
import com.ibm.icu.d.ka;
import com.ibm.icu.d.lf;
import java.text.CharacterIterator;
import java.util.Stack;

class jz
implements eg {
    private static final byte a = 3;
    private static final byte b = 3;
    private static final byte c = 3;
    private static final char d = '\u0e2f';
    private static final char e = '\u0e46';
    private static final byte f = 2;
    private dt g = ds.a("Thai");
    private static lf h = new lf();
    private static lf i;
    private static lf j;
    private static lf k;
    private static lf l;

    public boolean a(int n2, int n3) {
        if (n3 == 1 || n3 == 2) {
            int n4 = com.ibm.icu.b.b.e(n2, 4106);
            return n4 == 38;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public int a(CharacterIterator var1_1, int var2_2, int var3_3, boolean var4_4, int var5_5, Stack var6_6) {
        if (var3_3 - var2_2 < 2) {
            return 0;
        }
        var7_7 = 0;
        var10_8 = new ka[3];
        for (var11_9 = 0; var11_9 < 3; ++var11_9) {
            var10_8[var11_9] = new ka();
        }
        var1_1.setIndex(var2_2);
        while (true) {
            block26: {
                if ((var9_11 = var1_1.getIndex()) >= var3_3) {
                    if ((Integer)var6_6.peek() < var3_3) return var7_7;
                    var6_6.pop();
                    --var7_7;
                    return var7_7;
                }
                var8_10 = 0;
                var12_12 = var10_8[var7_7 % 3].a(var1_1, this.g, var3_3);
                if (var12_12 == 1) {
                    var8_10 = var10_8[var7_7 % 3].a(var1_1);
                    ++var7_7;
                } else if (var12_12 > 1) {
                    var13_13 = 0;
                    if (var1_1.getIndex() < var3_3) {
                        block2: do {
                            var14_14 = 1;
                            if (var10_8[(var7_7 + 1) % 3].a(var1_1, this.g, var3_3) <= 0) continue;
                            if (var14_14 < 2) {
                                var10_8[var7_7 % 3].b();
                                var14_14 = 2;
                            }
                            if (var1_1.getIndex() >= var3_3) break;
                            do {
                                if (var10_8[(var7_7 + 2) % 3].a(var1_1, this.g, var3_3) <= 0) continue;
                                var10_8[var7_7 % 3].b();
                                var13_13 = 1;
                                continue block2;
                            } while (var10_8[(var7_7 + 1) % 3].b(var1_1));
                        } while (var10_8[var7_7 % 3].b(var1_1) && var13_13 == 0);
                    }
                    var8_10 = var10_8[var7_7 % 3].a(var1_1);
                    ++var7_7;
                }
                if (var1_1.getIndex() < var3_3 && var8_10 < 3) {
                    if (var10_8[var7_7 % 3].a(var1_1, this.g, var3_3) > 0 || var8_10 != 0 && var10_8[var7_7 % 3].a() >= 3) {
                        var1_1.setIndex(var9_11 + var8_10);
                    } else {
                        var13_13 = var3_3 - (var9_11 + var8_10);
                        var14_14 = var1_1.current();
                        var15_15 = 0;
                        while (true) {
                            var1_1.next();
                            var11_9 = var1_1.current();
                            ++var15_15;
                            if (--var13_13 <= 0) break;
                            if (jz.i.b(var14_14) && jz.j.b(var11_9)) {
                                var16_16 = var10_8[(var7_7 + 1) % 3].a(var1_1, this.g, var3_3);
                                var1_1.setIndex(var9_11 + var8_10 + var15_15);
                                if (var16_16 > 0) break;
                            }
                            var14_14 = var11_9;
                        }
                        if (var8_10 <= 0) {
                            ++var7_7;
                        }
                        var8_10 += var15_15;
                    }
                }
                while ((var13_13 = var1_1.getIndex()) < var3_3 && jz.l.b(var1_1.current())) {
                    var1_1.next();
                    var8_10 += var1_1.getIndex() - var13_13;
                }
                if (var1_1.getIndex() >= var3_3 || var8_10 <= 0) break block26;
                if (var10_8[var7_7 % 3].a(var1_1, this.g, var3_3) > 0) ** GOTO lbl-1000
                v0 = var1_1.current();
                var11_9 = v0;
                if (jz.k.b(v0)) {
                    if (var11_9 == 3631) {
                        if (!jz.k.b(var1_1.previous())) {
                            var1_1.next();
                            var1_1.next();
                            ++var8_10;
                            var11_9 = var1_1.current();
                        } else {
                            var1_1.next();
                        }
                    }
                    if (var11_9 == 3654) {
                        if (var1_1.previous() != '\u0e46') {
                            var1_1.next();
                            var1_1.next();
                            ++var8_10;
                        } else {
                            var1_1.next();
                        }
                    }
                } else lbl-1000:
                // 2 sources

                {
                    var1_1.setIndex(var9_11 + var8_10);
                }
            }
            if (var8_10 <= 0) continue;
            var6_6.push(var9_11 + var8_10);
        }
    }

    static {
        l = new lf();
        i = new lf();
        j = new lf();
        k = new lf();
        h.a("[[:Thai:]&[:LineBreak=SA:]]");
        h.k();
        l.a("[[:Thai:]&[:LineBreak=SA:]&[:M:]]");
        l.e(32);
        i = h;
        i.g(3633);
        i.e(3648, 3652);
        j.b(3585, 3630);
        j.b(3648, 3652);
        k.e(3631);
        k.e(3654);
        l.k();
        i.k();
        j.k();
        k.k();
        h.l();
        l.l();
        i.l();
        j.l();
        k.l();
    }
}

