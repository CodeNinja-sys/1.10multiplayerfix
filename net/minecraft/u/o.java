/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import java.util.List;
import java.util.Random;
import net.minecraft.client.k.ce;
import org.apache.commons.c.am;

public class o {
    private static final o a = new o();
    private final Random b = new Random();
    private final String[] c = "the elder scrolls klaatu berata niktu xyzzy bless curse light darkness fire air earth water hot dry cold wet ignite snuff embiggen twist shorten stretch fiddle destroy imbue galvanize enchant free limited range of towards inside sphere cube self other ball mental physical grow shrink demon elemental spirit animal creature beast humanoid undead fresh stale phnglui mglwnafh cthulhu rlyeh wgahnagl fhtagnbaguette".split(" ");

    public static o a() {
        return a;
    }

    public String a(ce ce2, int n2) {
        int n3 = this.b.nextInt(2) + 3;
        String string = "";
        for (int i2 = 0; i2 < n3; ++i2) {
            if (i2 > 0) {
                string = String.valueOf(string) + " ";
            }
            string = String.valueOf(string) + this.c[this.b.nextInt(this.c.length)];
        }
        List list = ce2.c(string, n2);
        return am.a((Iterable)(list.size() >= 2 ? list.subList(0, 2) : list), " ");
    }

    public void a(long l2) {
        this.b.setSeed(l2);
    }
}

