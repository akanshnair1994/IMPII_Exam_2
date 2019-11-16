package com.hexamind.retrofitevaluation1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

public class MainActivity extends AppCompatActivity {
    private ApiService apiService;
    private JsonElement jsonElement;
    private TextView text, title;
    private ImageView image;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
        title = findViewById(R.id.title);
        image = findViewById(R.id.image);
        progressBar = findViewById(R.id.progressBar);

        progressBar.setVisibility(View.VISIBLE);
        apiService = RetrofitClient.getApiService();
        Call<JsonElement> call = apiService.getJson();

        call.enqueue(new Callback<JsonElement>() {
            @Override
            public void onResponse(Call<JsonElement> call, Response<JsonElement> response) {
                if (response.isSuccessful()) {
                    jsonElement = response.body();

                    text.setText(jsonElement.getWidget().getText().getData());
                    title.setText(jsonElement.getWidget().getWindow().getTitle());
                    Glide.with(MainActivity.this)
                            .load(jsonElement.getWidget().getImage().getSrc())
                            .listener(new RequestListener<Drawable>() {
                                @Override
                                public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                                    Log.e(MainActivity.class.getName(), "Error: " + e.getMessage());
                                    Toast.makeText(MainActivity.this, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();

                                    return false;
                                }

                                @Override
                                public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                                    progressBar.setVisibility(View.GONE);

                                    return false;
                                }
                            })
                            .into(image);
                }
            }

            @Override
            public void onFailure(Call<JsonElement> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Some error occurred while getting the data..", Toast.LENGTH_SHORT).show();
                Log.e(MainActivity.class.getName(), "Error: " + t.getMessage());
            }
        });
    }
}
