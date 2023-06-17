/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.c.a;

public class bpo
extends mn {
    @Override
    public String a() {
        return "stop";
    }

    @Override
    public String a(ala ala2) {
        return "commands.stop.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        if (a2.d != null) {
            bpo.a(ala2, (fh)this, "commands.stop.start", new Object[0]);
        }
        a2.x();
    }
}

