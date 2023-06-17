/*
 * Decompiled with CFR 0.150.
 */
import java.util.UUID;
import net.minecraft.c.a;

public class axi
extends mn {
    @Override
    public String a() {
        return "entitydata";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.entitydata.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        bvp bvp2;
        if (arrstring.length < 2) {
            throw new ben("commands.entitydata.usage", new Object[0]);
        }
        cpk cpk2 = axi.b(a2, ala2, arrstring[0]);
        if (cpk2 instanceof bdl) {
            throw new kx("commands.entitydata.noPlayers", cpk2.v());
        }
        bvp bvp3 = axi.a(cpk2);
        bvp bvp4 = bvp3.d();
        try {
            bvp2 = bdg.a(axi.a(ala2, arrstring, 1).i());
        }
        catch (aoo aoo2) {
            throw new kx("commands.entitydata.tagError", aoo2.getMessage());
        }
        UUID uUID = cpk2.cx();
        bvp3.a(bvp2);
        cpk2.b(uUID);
        if (bvp3.equals(bvp4)) {
            throw new kx("commands.entitydata.failed", bvp3.toString());
        }
        cpk2.f(bvp3);
        axi.a(ala2, (fh)this, "commands.entitydata.success", bvp3.toString());
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 0;
    }
}

