/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.List;
import java.util.Random;
import net.minecraft.c.a;
import net.minecraft.q.v;

public class cdw
extends mn {
    @Override
    public String a() {
        return "weather";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.weather.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        if (arrstring.length < 1 || arrstring.length > 2) {
            throw new ben("commands.weather.usage", new Object[0]);
        }
        int n2 = (300 + new Random().nextInt(600)) * 20;
        if (arrstring.length >= 2) {
            n2 = cdw.a(arrstring[1], 1, 1000000) * 20;
        }
        v v2 = a2.d[0];
        cvn cvn2 = ((iu)((Object)v2)).E();
        if ("clear".equalsIgnoreCase(arrstring[0])) {
            cvn2.g(n2);
            cvn2.f(0);
            cvn2.e(0);
            cvn2.b(false);
            cvn2.a(false);
            cdw.a(ala2, (fh)this, "commands.weather.clear", new Object[0]);
        } else if ("rain".equalsIgnoreCase(arrstring[0])) {
            cvn2.g(0);
            cvn2.f(n2);
            cvn2.e(n2);
            cvn2.b(true);
            cvn2.a(false);
            cdw.a(ala2, (fh)this, "commands.weather.rain", new Object[0]);
        } else if ("thunder".equalsIgnoreCase(arrstring[0])) {
            cvn2.g(0);
            cvn2.f(n2);
            cvn2.e(n2);
            cvn2.b(true);
            cvn2.a(true);
            cdw.a(ala2, (fh)this, "commands.weather.thunder", new Object[0]);
        } else {
            throw new ben("commands.weather.usage", new Object[0]);
        }
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1) {
            return cdw.a(arrstring, "clear", "rain", "thunder");
        }
        return Collections.emptyList();
    }
}

