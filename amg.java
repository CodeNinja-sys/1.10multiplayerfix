/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.c.a;

public class amg
extends mn {
    @Override
    public String a() {
        return "list";
    }

    @Override
    public int b() {
        return 0;
    }

    @Override
    public String a(ala ala2) {
        return "commands.players.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        int n2 = a2.H();
        ala2.a(new du("commands.players.list", n2, a2.I()));
        ala2.a(new aym(((cmt)((Object)a2.al())).a(arrstring.length > 0 && "uuids".equalsIgnoreCase(arrstring[0]))));
        ala2.a(bnw.e, n2);
    }
}

