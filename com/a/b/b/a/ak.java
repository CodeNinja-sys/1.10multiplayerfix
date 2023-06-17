/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.ag;
import com.a.b.an;
import com.a.b.d.a;
import com.a.b.d.d;
import com.a.b.d.e;
import java.util.BitSet;

final class ak
extends an {
    ak() {
    }

    public BitSet b(a a2) {
        if (a2.f() == d.i) {
            a2.j();
            return null;
        }
        BitSet bitSet = new BitSet();
        a2.a();
        int n2 = 0;
        d d2 = a2.f();
        while (d2 != d.b) {
            boolean bl2;
            switch (d2) {
                case g: {
                    bl2 = a2.m() != 0;
                    break;
                }
                case h: {
                    bl2 = a2.i();
                    break;
                }
                case f: {
                    String string = a2.h();
                    try {
                        bl2 = Integer.parseInt(string) != 0;
                        break;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw new ag("Error: Expecting: bitset number value (1, 0), Found: " + string);
                    }
                }
                default: {
                    throw new ag("Invalid bitset value type: " + (Object)((Object)d2));
                }
            }
            if (bl2) {
                bitSet.set(n2);
            }
            ++n2;
            d2 = a2.f();
        }
        a2.b();
        return bitSet;
    }

    public void a(e e2, BitSet bitSet) {
        if (bitSet == null) {
            e2.f();
            return;
        }
        e2.b();
        for (int i2 = 0; i2 < bitSet.length(); ++i2) {
            int n2 = bitSet.get(i2) ? 1 : 0;
            e2.a((long)n2);
        }
        e2.c();
    }

    public /* synthetic */ Object a(a a2) {
        return this.b(a2);
    }
}

