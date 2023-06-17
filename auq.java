/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.c.a;

public class auq
extends mn {
    @Override
    public String a() {
        return "setidletimeout";
    }

    @Override
    public int b() {
        return 3;
    }

    @Override
    public String a(ala ala2) {
        return "commands.setidletimeout.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        if (arrstring.length != 1) {
            throw new ben("commands.setidletimeout.usage", new Object[0]);
        }
        int n2 = auq.a(arrstring[0], 0);
        a2.d(n2);
        auq.a(ala2, (fh)this, "commands.setidletimeout.success", n2);
    }
}

