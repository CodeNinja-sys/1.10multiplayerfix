/*
 * Decompiled with CFR 0.150.
 */
import java.util.Arrays;
import java.util.List;
import net.minecraft.c.a;

public class awh
extends mn {
    @Override
    public List c() {
        return Arrays.asList("w", "msg");
    }

    @Override
    public String a() {
        return "tell";
    }

    @Override
    public int b() {
        return 0;
    }

    @Override
    public String a(ala ala2) {
        return "commands.message.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        if (arrstring.length < 2) {
            throw new ben("commands.message.usage", new Object[0]);
        }
        czt czt2 = awh.a(a2, ala2, arrstring[0]);
        if (czt2 == ala2) {
            throw new chs("commands.message.sameTarget", new Object[0]);
        }
        cbg cbg2 = awh.b(ala2, arrstring, 1, !(ala2 instanceof bdl));
        du du2 = new du("commands.message.display.incoming", ala2.v(), cbg2.f());
        du du3 = new du("commands.message.display.outgoing", czt2.v(), cbg2.f());
        du2.h().a(aug.h).b(true);
        du3.h().a(aug.h).b(true);
        ((cpk)czt2).a(du2);
        ala2.a(du3);
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        return awh.a(arrstring, a2.J());
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 0;
    }
}

