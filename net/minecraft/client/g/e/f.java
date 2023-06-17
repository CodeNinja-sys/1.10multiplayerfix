/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.e;

import java.util.BitSet;
import java.util.Set;
import net.minecraft.u.ad;

public class f {
    private static final int a = ad.values().length;
    private final BitSet b = new BitSet(a * a);

    public void a(Set set) {
        for (ad ad2 : set) {
            for (ad ad3 : set) {
                this.a(ad2, ad3, true);
            }
        }
    }

    public void a(ad ad2, ad ad3, boolean bl2) {
        this.b.set(ad2.ordinal() + ad3.ordinal() * a, bl2);
        this.b.set(ad3.ordinal() + ad2.ordinal() * a, bl2);
    }

    public void a(boolean bl2) {
        this.b.set(0, this.b.size(), bl2);
    }

    public boolean a(ad ad2, ad ad3) {
        return this.b.get(ad2.ordinal() + ad3.ordinal() * a);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(' ');
        for (ad ad2 : ad.values()) {
            stringBuilder.append(' ').append(ad2.toString().toUpperCase().charAt(0));
        }
        stringBuilder.append('\n');
        for (ad ad2 : ad.values()) {
            stringBuilder.append(ad2.toString().toUpperCase().charAt(0));
            for (ad ad3 : ad.values()) {
                if (ad2 == ad3) {
                    stringBuilder.append("  ");
                    continue;
                }
                boolean bl2 = this.a(ad2, ad3);
                stringBuilder.append(' ').append(bl2 ? (char)'Y' : 'n');
            }
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }
}

