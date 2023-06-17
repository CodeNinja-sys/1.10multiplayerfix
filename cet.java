/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.apache.commons.b.t;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class cet {
    private static final d a = org.apache.logging.log4j.c.c();
    private final String b;
    private final Throwable c;
    private final sx d = new sx(this, "System Details");
    private final List e = ov.a();
    private File f;
    private boolean g = true;
    private StackTraceElement[] h = new StackTraceElement[0];

    public cet(String string, Throwable throwable) {
        this.b = string;
        this.c = throwable;
        this.g();
    }

    private void g() {
        this.d.a("Minecraft Version", new bun(this));
        this.d.a("Operating System", new bho(this));
        this.d.a("Java Version", new dez(this));
        this.d.a("Java VM Version", new aqh(this));
        this.d.a("Memory", new bau(this));
        this.d.a("JVM Flags", new sb(this));
        this.d.a("IntCache", new cgo(this));
    }

    public String a() {
        return this.b;
    }

    public Throwable b() {
        return this.c;
    }

    public void a(StringBuilder stringBuilder) {
        if (!(this.h != null && this.h.length > 0 || this.e.isEmpty())) {
            this.h = (StackTraceElement[])org.apache.commons.c.c.a((Object[])((sx)this.e.get(0)).a(), 0, 1);
        }
        if (this.h != null && this.h.length > 0) {
            stringBuilder.append("-- Head --\n");
            stringBuilder.append("Thread: ").append(Thread.currentThread().getName()).append("\n");
            stringBuilder.append("Stacktrace:\n");
            for (StackTraceElement stackTraceElement : this.h) {
                stringBuilder.append("\t").append("at ").append(stackTraceElement);
                stringBuilder.append("\n");
            }
            stringBuilder.append("\n");
        }
        for (sx sx2 : this.e) {
            sx2.a(stringBuilder);
            stringBuilder.append("\n\n");
        }
        this.d.a(stringBuilder);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String c() {
        StringWriter stringWriter = null;
        PrintWriter printWriter = null;
        Throwable throwable = this.c;
        if (throwable.getMessage() == null) {
            if (throwable instanceof NullPointerException) {
                throwable = new NullPointerException(this.b);
            } else if (throwable instanceof StackOverflowError) {
                throwable = new StackOverflowError(this.b);
            } else if (throwable instanceof OutOfMemoryError) {
                throwable = new OutOfMemoryError(this.b);
            }
            throwable.setStackTrace(this.c.getStackTrace());
        }
        String string = throwable.toString();
        try {
            stringWriter = new StringWriter();
            printWriter = new PrintWriter(stringWriter);
            throwable.printStackTrace(printWriter);
            string = stringWriter.toString();
        }
        catch (Throwable throwable2) {
            t.a(stringWriter);
            t.a(printWriter);
            throw throwable2;
        }
        t.a(stringWriter);
        t.a(printWriter);
        return string;
    }

    public String d() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("---- Minecraft Crash Report ----\n");
        stringBuilder.append("// ");
        stringBuilder.append(cet.h());
        stringBuilder.append("\n\n");
        stringBuilder.append("Time: ");
        stringBuilder.append(new SimpleDateFormat().format(new Date()));
        stringBuilder.append("\n");
        stringBuilder.append("Description: ");
        stringBuilder.append(this.b);
        stringBuilder.append("\n\n");
        stringBuilder.append(this.c());
        stringBuilder.append("\n\nA detailed walkthrough of the error, its code path and all known details is as follows:\n");
        for (int i2 = 0; i2 < 87; ++i2) {
            stringBuilder.append("-");
        }
        stringBuilder.append("\n\n");
        this.a(stringBuilder);
        return stringBuilder.toString();
    }

    public File e() {
        return this.f;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(File file) {
        boolean bl2;
        if (this.f != null) {
            return false;
        }
        if (file.getParentFile() != null) {
            file.getParentFile().mkdirs();
        }
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(this.d());
            this.f = file;
            bl2 = true;
        }
        catch (Throwable throwable) {
            boolean bl3;
            try {
                a.b("Could not save crash report to {}", file, throwable);
                bl3 = false;
            }
            catch (Throwable throwable2) {
                t.a(fileWriter);
                throw throwable2;
            }
            t.a(fileWriter);
            return bl3;
        }
        t.a(fileWriter);
        return bl2;
    }

    public sx f() {
        return this.d;
    }

    public sx a(String string) {
        return this.a(string, 1);
    }

    public sx a(String string, int n2) {
        sx sx2 = new sx(this, string);
        if (this.g) {
            int n3 = sx2.a(n2);
            StackTraceElement[] arrstackTraceElement = this.c.getStackTrace();
            StackTraceElement stackTraceElement = null;
            StackTraceElement stackTraceElement2 = null;
            int n4 = arrstackTraceElement.length - n3;
            if (n4 < 0) {
                System.out.println("Negative index in crash report handler (" + arrstackTraceElement.length + "/" + n3 + ")");
            }
            if (arrstackTraceElement != null && 0 <= n4 && n4 < arrstackTraceElement.length) {
                stackTraceElement = arrstackTraceElement[n4];
                if (arrstackTraceElement.length + 1 - n3 < arrstackTraceElement.length) {
                    stackTraceElement2 = arrstackTraceElement[arrstackTraceElement.length + 1 - n3];
                }
            }
            this.g = sx2.a(stackTraceElement, stackTraceElement2);
            if (n3 > 0 && !this.e.isEmpty()) {
                sx sx3 = (sx)this.e.get(this.e.size() - 1);
                sx3.b(n3);
            } else if (arrstackTraceElement != null && arrstackTraceElement.length >= n3 && 0 <= n4 && n4 < arrstackTraceElement.length) {
                this.h = new StackTraceElement[n4];
                System.arraycopy(arrstackTraceElement, 0, this.h, 0, this.h.length);
            } else {
                this.g = false;
            }
        }
        this.e.add(sx2);
        return sx2;
    }

    private static String h() {
        String[] arrstring = new String[]{"Who set us up the TNT?", "Everything's going to plan. No, really, that was supposed to happen.", "Uh... Did I do that?", "Oops.", "Why did you do that?", "I feel sad now :(", "My bad.", "I'm sorry, Dave.", "I let you down. Sorry :(", "On the bright side, I bought you a teddy bear!", "Daisy, daisy...", "Oh - I know what I did wrong!", "Hey, that tickles! Hehehe!", "I blame Dinnerbone.", "You should try our sister game, Minceraft!", "Don't be sad. I'll do better next time, I promise!", "Don't be sad, have a hug! <3", "I just don't know what went wrong :(", "Shall we play a game?", "Quite honestly, I wouldn't worry myself about that.", "I bet Cylons wouldn't have this problem.", "Sorry :(", "Surprise! Haha. Well, this is awkward.", "Would you like a cupcake?", "Hi. I'm Minecraft, and I'm a crashaholic.", "Ooh. Shiny.", "This doesn't make any sense!", "Why is it breaking :(", "Don't do that.", "Ouch. That hurt :(", "You're mean.", "This is a token for 1 free hug. Redeem at your nearest Mojangsta: [~~HUG~~]", "There are four lights!", "But it works on my machine."};
        try {
            return arrstring[(int)(System.nanoTime() % (long)arrstring.length)];
        }
        catch (Throwable throwable) {
            return "Witty comment unavailable :(";
        }
    }

    public static cet a(Throwable throwable, String string) {
        cet cet2 = throwable instanceof oz ? ((oz)throwable).a() : new cet(string, throwable);
        return cet2;
    }
}

