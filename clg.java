/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.c.a;

public class clg
extends mn {
    @Override
    public boolean a(a a2, ala ala2) {
        return a2.R() || super.a(a2, ala2);
    }

    @Override
    public String a() {
        return "seed";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.seed.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        Object object = ala2 instanceof bdl ? ((bdl)ala2).aQ : a2.a(0);
        ala2.a(new du("commands.seed.success", ((iu)object).y()));
    }
}

