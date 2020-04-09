package itkido.me.kotlinbottomnavbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import me.ibrahimsn.lib.OnItemReselectedListener
import me.ibrahimsn.lib.OnItemSelectedListener

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomBar.setOnItemSelectedListener(object: OnItemSelectedListener {
            override fun onItemSelect(pos: Int) {
                status.text = "Item $pos selected"
            }
        })

        bottomBar.setOnItemReselectedListener(object: OnItemReselectedListener {
            override fun onItemReselect(pos: Int) {
                status.text = "Item $pos re-selected"
            }
        })

    }
}
