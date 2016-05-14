package foo.bar.kaptissue

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import butterknife.BindView
import butterknife.ButterKnife
import foo.LoginController


class MainActivity : Activity() {
    @BindView(R.id.automatic)
    lateinit var view: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = LayoutInflater.from(this).inflate(R.layout.main_layout, null)
        setContentView(view)
        val viewHolder = LoginController().ViewHolder(null)
        ButterKnife.bind(viewHolder, view)
        viewHolder.view.text = "hello KAPT"
    }
}