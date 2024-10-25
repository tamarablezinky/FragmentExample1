package id.ac.polbeng.tamarablezinky.fragmentexample1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.ac.polbeng.tamarablezinky.fragmentexample1.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity(), Coordinator {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onBookChanged(index:Int) {
        val frag =
            supportFragmentManager.findFragmentById(R.id.fragment_book_description)
        if (frag is BookDescription) {
            frag.changeDescription(index)
        }
    }
}