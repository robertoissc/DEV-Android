package to.dev.dev_android.base.activity

import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity<B: ViewDataBinding> : AppCompatActivity() {

    lateinit var binding: B

    @LayoutRes
    protected abstract fun layout(): Int


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layout())
    }

}