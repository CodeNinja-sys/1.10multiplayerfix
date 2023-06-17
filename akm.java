/*
 * Decompiled with CFR 0.150.
 */
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import net.minecraft.c.a;
import org.apache.commons.b.t;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class akm
extends mn {
    private static final d a = org.apache.logging.log4j.c.c();
    private long b;
    private int c;

    @Override
    public String a() {
        return "debug";
    }

    @Override
    public int b() {
        return 3;
    }

    @Override
    public String a(ala ala2) {
        return "commands.debug.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        if (arrstring.length < 1) {
            throw new ben("commands.debug.usage", new Object[0]);
        }
        if ("start".equals(arrstring[0])) {
            if (arrstring.length != 1) {
                throw new ben("commands.debug.usage", new Object[0]);
            }
            akm.a(ala2, (fh)this, "commands.debug.start", new Object[0]);
            a2.aq();
            this.b = net.minecraft.c.a.av();
            this.c = a2.ap();
        } else if ("stop".equals(arrstring[0])) {
            if (arrstring.length != 1) {
                throw new ben("commands.debug.usage", new Object[0]);
            }
            if (!((cfe)a2.c).a) {
                throw new kx("commands.debug.notStarted", new Object[0]);
            }
            long l2 = net.minecraft.c.a.av();
            int n2 = a2.ap();
            long l3 = l2 - this.b;
            int n3 = n2 - this.c;
            this.a(l3, n3, a2);
            ((cfe)a2.c).a = false;
            akm.a(ala2, (fh)this, "commands.debug.stop", Float.valueOf((float)l3 / 1000.0f), n3);
        } else {
            throw new ben("commands.debug.usage", new Object[0]);
        }
    }

    private void a(long l2, int n2, a a2) {
        File file = new File(a2.d("debug"), "profile-results-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + ".txt");
        file.getParentFile().mkdirs();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(this.b(l2, n2, a2));
        }
        catch (Throwable throwable) {
            t.a(fileWriter);
            a.b("Could not save profiler results to {}", file, throwable);
        }
    }

    private String b(long l2, int n2, a a2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("---- Minecraft Profiler Results ----\n");
        stringBuilder.append("// ");
        stringBuilder.append(akm.d());
        stringBuilder.append("\n\n");
        stringBuilder.append("Time span: ").append(l2).append(" ms\n");
        stringBuilder.append("Tick span: ").append(n2).append(" ticks\n");
        stringBuilder.append("// This is approximately ").append(String.format("%.2f", Float.valueOf((float)n2 / ((float)l2 / 1000.0f)))).append(" ticks per second. It should be ").append(20).append(" ticks per second\n\n");
        stringBuilder.append("--- BEGIN PROFILE DUMP ---\n\n");
        this.a(0, "root", stringBuilder, a2);
        stringBuilder.append("--- END PROFILE DUMP ---\n\n");
        return stringBuilder.toString();
    }

    private void a(int n2, String string, StringBuilder stringBuilder, a a2) {
        List list = ((cfe)((Object)a2.c)).b(string);
        if (list == null || list.size() < 3) {
            return;
        }
        for (int i2 = 1; i2 < list.size(); ++i2) {
            tg tg2 = (tg)list.get(i2);
            stringBuilder.append(String.format("[%02d] ", n2));
            for (int i3 = 0; i3 < n2; ++i3) {
                stringBuilder.append("|   ");
            }
            stringBuilder.append(tg2.c).append(" - ").append(String.format("%.2f", tg2.a)).append("%/").append(String.format("%.2f", tg2.b)).append("%\n");
            if ("unspecified".equals(tg2.c)) continue;
            try {
                this.a(n2 + 1, string + "." + tg2.c, stringBuilder, a2);
                continue;
            }
            catch (Exception exception) {
                stringBuilder.append("[[ EXCEPTION ").append(exception).append(" ]]");
            }
        }
    }

    private static String d() {
        String[] arrstring = new String[]{"Shiny numbers!", "Am I not running fast enough? :(", "I'm working as hard as I can!", "Will I ever be good enough for you? :(", "Speedy. Zoooooom!", "Hello world", "40% better than a crash report.", "Now with extra numbers", "Now with less numbers", "Now with the same numbers", "You should add flames to things, it makes them go faster!", "Do you feel the need for... optimization?", "*cracks redstone whip*", "Maybe if you treated it better then it'll have more motivation to work faster! Poor server."};
        try {
            return arrstring[(int)(System.nanoTime() % (long)arrstring.length)];
        }
        catch (Throwable throwable) {
            return "Witty comment unavailable :(";
        }
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1) {
            return akm.a(arrstring, "start", "stop");
        }
        return Collections.emptyList();
    }
}

