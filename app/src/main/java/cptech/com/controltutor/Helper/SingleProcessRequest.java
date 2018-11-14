package cptech.com.controltutor.Helper;

import android.graphics.Bitmap;
import android.util.Base64;

import com.google.gson.annotations.SerializedName;

import java.io.ByteArrayOutputStream;

public class SingleProcessRequest {
    @SerializedName("url")
    private String url;

    public SingleProcessRequest(Bitmap bm) {
        url = "data:image/jpeg;base64," + bitmapToBase64(bm);
    }

    public SingleProcessRequest(byte[] fileBytes) {
        url =  Base64.encodeToString(fileBytes, Base64.DEFAULT);
    }

    private String bitmapToBase64(Bitmap image) {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        image.compress(Bitmap.CompressFormat.JPEG, 100, os);
        return Base64.encodeToString(os.toByteArray(), Base64.DEFAULT);
    }

    public String getUrl() {
        return url;
    }
}