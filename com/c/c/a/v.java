/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.a;

import com.c.c.a.r;
import com.c.c.c.a;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class v
extends r {
    private String c;

    public v(String string, String string2, int n2, int n3) {
        super(string, n2, n3);
        this.c = string2;
    }

    public v f() {
        try {
            if (this.c != null) {
                this.a.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            }
            this.a.setDoOutput(true);
            this.a.setDoInput(true);
            this.a.setRequestMethod("PUT");
            OutputStream outputStream = this.a.getOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
            outputStreamWriter.write(this.c);
            outputStreamWriter.close();
            outputStream.flush();
            return this;
        }
        catch (Exception exception) {
            throw new a(exception.getMessage(), exception);
        }
    }

    @Override
    public /* synthetic */ r e() {
        return this.f();
    }
}

