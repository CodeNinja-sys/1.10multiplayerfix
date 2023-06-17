/*
 * Decompiled with CFR 0.150.
 */
package d.b.a.a.a;

import d.a.c;
import d.c.b;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class a
implements c {
    private String a;
    private String b;
    private String c = null;
    private String d;
    private String e;
    private String f;
    private boolean g;

    public String a() {
        return this.a;
    }

    public void a(String string) {
        this.a = string;
    }

    public String b() {
        return this.b;
    }

    public void b(String string) {
        this.b = string;
    }

    public String c() {
        if (this.c == null) {
            StringBuilder stringBuilder = new StringBuilder();
            if (this.a().contentEquals("GenuineIntel")) {
                stringBuilder.append(this.d() ? "Intel64" : "x86");
            } else {
                stringBuilder.append(this.a());
            }
            stringBuilder.append(" Family ");
            stringBuilder.append(this.g());
            stringBuilder.append(" Model ");
            stringBuilder.append(this.f());
            stringBuilder.append(" Stepping ");
            stringBuilder.append(this.e());
            this.c = stringBuilder.toString();
        }
        return this.c;
    }

    public void c(String string) {
        this.c = string;
    }

    public boolean d() {
        return this.g;
    }

    public void a(boolean bl2) {
        this.g = bl2;
    }

    public String e() {
        return this.d;
    }

    public void d(String string) {
        this.d = string;
    }

    public String f() {
        return this.e;
    }

    public void e(String string) {
        this.e = string;
    }

    public String g() {
        return this.f;
    }

    public void f(String string) {
        this.f = string;
    }

    public float h() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileReader("/proc/stat"));
        }
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Problem with: /proc/stat");
            System.err.println(fileNotFoundException.getMessage());
            return -1.0f;
        }
        scanner.useDelimiter("\n");
        String[] arrstring = scanner.next().split(" ");
        ArrayList<Float> arrayList = new ArrayList<Float>();
        for (String string : arrstring) {
            if (!string.matches("-?\\d+(\\.\\d+)?")) continue;
            arrayList.add(Float.valueOf(string));
        }
        float f2 = (((Float)arrayList.get(0)).floatValue() + ((Float)arrayList.get(2)).floatValue()) * 100.0f / (((Float)arrayList.get(0)).floatValue() + ((Float)arrayList.get(2)).floatValue() + ((Float)arrayList.get(3)).floatValue());
        return d.c.b.a(f2, 2);
    }

    public String toString() {
        return this.b();
    }
}

