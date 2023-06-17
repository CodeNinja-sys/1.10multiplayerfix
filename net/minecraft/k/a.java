/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.k;

import com.a.a.d.ov;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import net.minecraft.k.b;
import net.minecraft.k.c;
import net.minecraft.k.d;
import net.minecraft.k.e;
import net.minecraft.k.f;
import net.minecraft.k.g;
import net.minecraft.k.h;
import net.minecraft.k.i;
import net.minecraft.u.bo;
import org.apache.commons.b.t;

public class a {
    private static final org.apache.logging.log4j.d a = org.apache.logging.log4j.c.c();
    private final String b;
    private final Throwable c;
    private final i d = new i(this, "System Details");
    private final List e = ov.a();
    private File f;
    private boolean g = true;
    private StackTraceElement[] h = new StackTraceElement[0];

    public a(String string, Throwable throwable) {
        this.b = string;
        this.c = throwable;
        this.g();
    }

    private void g() {
        this.d.a("Minecraft Version", new b(this));
        this.d.a("Operating System", new c(this));
        this.d.a("Java Version", new d(this));
        this.d.a("Java VM Version", new e(this));
        this.d.a("Memory", new f(this));
        this.d.a("JVM Flags", new g(this));
        this.d.a("IntCache", new h(this));
    }

    public String a() {
        return this.b;
    }

    public Throwable b() {
        return this.c;
    }

    public void a(StringBuilder stringBuilder) {
        if (!(this.h != null && this.h.length > 0 || this.e.isEmpty())) {
            this.h = (StackTraceElement[])org.apache.commons.c.c.a((Object[])((i)this.e.get(0)).a(), 0, 1);
        }
        if (this.h != null && this.h.length > 0) {
            stringBuilder.append("-- Head --\n");
            stringBuilder.append("Thread: ").append(Thread.currentThread().getName()).append("\n");
            stringBuilder.append("Stacktrace:\n");
            StackTraceElement[] arrstackTraceElement = this.h;
            int n2 = this.h.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                Object object = arrstackTraceElement[i2];
                stringBuilder.append("\t").append("at ").append(object);
                stringBuilder.append("\n");
            }
            stringBuilder.append("\n");
        }
        for (Object object : this.e) {
            ((i)object).a(stringBuilder);
            stringBuilder.append("\n\n");
        }
        this.d.a(stringBuilder);
    }

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
        stringBuilder.append(net.minecraft.k.a.h());
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(File file) {
        boolean bl3;
        if (this.f != null) {
            return false;
        }
        if (file.getParentFile() != null) {
            file.getParentFile().mkdirs();
        }
        FileWriter fileWriter = null;
        try {
            boolean bl4;
            fileWriter = new FileWriter(file);
            fileWriter.write(this.d());
            this.f = file;
            bl3 = bl4 = true;
        }
        catch (Throwable throwable) {
            boolean bl2;
            try {
                a.b("Could not save crash report to {}", file, throwable);
                bl2 = false;
            }
            catch (Throwable throwable2) {
                t.a(fileWriter);
                throw throwable2;
            }
            t.a(fileWriter);
            return bl2;
        }
        t.a(fileWriter);
        return bl3;
    }

    public i f() {
        return this.d;
    }

    public i a(String string) {
        return this.a(string, 1);
    }

    public i a(String string, int n2) {
        i i2 = new i(this, string);
        if (this.g) {
            int n3 = i2.a(n2);
            StackTraceElement[] arrstackTraceElement = this.c.getStackTrace();
            StackTraceElement stackTraceElement = null;
            StackTraceElement stackTraceElement2 = null;
            int n4 = arrstackTraceElement.length - n3;
            if (n4 < 0) {
                System.out.println("Negative index in crash report handler (" + arrstackTraceElement.length + "/" + n3 + ")");
            }
            if (arrstackTraceElement != null && n4 >= 0 && n4 < arrstackTraceElement.length) {
                stackTraceElement = arrstackTraceElement[n4];
                if (arrstackTraceElement.length + 1 - n3 < arrstackTraceElement.length) {
                    stackTraceElement2 = arrstackTraceElement[arrstackTraceElement.length + 1 - n3];
                }
            }
            this.g = i2.a(stackTraceElement, stackTraceElement2);
            if (n3 > 0 && !this.e.isEmpty()) {
                i i3 = (i)this.e.get(this.e.size() - 1);
                i3.b(n3);
            } else if (arrstackTraceElement != null && arrstackTraceElement.length >= n3 && n4 >= 0 && n4 < arrstackTraceElement.length) {
                this.h = new StackTraceElement[n4];
                System.arraycopy(arrstackTraceElement, 0, this.h, 0, this.h.length);
            } else {
                this.g = false;
            }
        }
        this.e.add(i2);
        return i2;
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

    public static a a(Throwable throwable, String string) {
        a a2 = throwable instanceof bo ? ((bo)throwable).a() : new a(string, throwable);
        return a2;
    }
}

