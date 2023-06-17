/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.e;

import com.a.a.d.ov;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import net.minecraft.client.e.d;

public class b
extends IOException {
    private final List a = ov.a();
    private final String b;

    public b(String string) {
        this.a.add(new d(null));
        this.b = string;
    }

    public b(String string, Throwable throwable) {
        super(throwable);
        this.a.add(new d(null));
        this.b = string;
    }

    public void a(String string) {
        d.a((d)this.a.get(0), string);
    }

    public void b(String string) {
        d.b((d)this.a.get(0), string);
        this.a.add(0, new d(null));
    }

    @Override
    public String getMessage() {
        return "Invalid " + this.a.get(this.a.size() - 1) + ": " + this.b;
    }

    public static b a(Exception exception) {
        if (exception instanceof b) {
            return (b)exception;
        }
        String string = exception.getMessage();
        if (exception instanceof FileNotFoundException) {
            string = "File not found";
        }
        return new b(string, exception);
    }
}

