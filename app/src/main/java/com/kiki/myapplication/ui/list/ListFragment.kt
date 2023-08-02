package com.kiki.myapplication.ui.list

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.google.android.gms.maps.model.LatLng
import com.kiki.myapplication.R
import com.kiki.myapplication.databinding.FragmentListBinding
import com.kiki.myapplication.databinding.ItemCategoryBinding
import com.kiki.myapplication.model.Makan
import com.kiki.myapplication.ui.SharedViewModel
import com.kiki.myapplication.ui.detail.DetailActivity
import com.kiki.myapplication.ui.home.HomeFooterAdapter
import com.kiki.myapplication.utils.resolveAttributeColor

class ListFragment : Fragment() {

    private var _binding: FragmentListBinding? = null
    private val binding get() = _binding!!

    private var currentLocation: LatLng? = LatLng(-7.423493043154317, 109.23020512856752)
    private val viewModel: SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentListBinding.inflate(inflater, container, false)
        initializeCategory()
        observeLivedata()
        return binding.root
    }


    private fun observeLivedata() {
        viewModel.location.observe(viewLifecycleOwner) {
            if (it != null) {
                binding.tvLocation.text = viewModel.getStringLocation(requireContext(), it)
                currentLocation = it
            } else {
                currentLocation = LatLng(-7.05800729, 109.426030)
            }
        }

        viewModel.touristAttractionData.observe(viewLifecycleOwner) {
            setupFootNote(it)
        }
    }

    /* Buat function setupFootNote() untuk mengatur adapter dari rvFootnote
    * Buat object footNoteAdapter dengan tipe HomeFooterAdapter dan inisialisasi dengan memanggil HomeFooterAdapter(headlineData)
    * Setelah itu, kita akan mengatur rvFootnote dengan memanggil footNoteAdapter
     */
    private fun setupFootNote(data: List<Makan>) {
        val footNoteAdapter = HomeFooterAdapter(data)
        with(binding.rvFootnote) {
            layoutManager = androidx.recyclerview.widget.LinearLayoutManager(
                context,
                androidx.recyclerview.widget.LinearLayoutManager.VERTICAL,
                false
            )
            adapter = footNoteAdapter.apply {
                onItemClick = { touristAttraction ->
                    navigateToDetail(touristAttraction)
                }
            }
            setHasFixedSize(true)
        }
    }

    private fun initializeCategory() {
        with(binding) {
            setupCategory(ivCategoryWarmindo, "Warmindo",R.drawable.ic_mie)
            setupCategory(ivCategoryCafe, "Cafe", R.drawable.ic_cafe)
            setupCategory(ivCategoryRestaurant, "Restaurant", R.drawable.ic_restaurant)


            activatedCategory(ivCategoryCafe)

            ivCategoryWarmindo.root.setOnClickListener { activatedCategory(ivCategoryWarmindo) }
            ivCategoryCafe.root.setOnClickListener { activatedCategory(ivCategoryCafe) }
            ivCategoryRestaurant.root.setOnClickListener { activatedCategory(ivCategoryRestaurant) }
        }
    }

    private fun setupCategory(
        binding: ItemCategoryBinding,
        categoryName: String,
        categoryImage: Int,
    ) {
        with(binding) {
            tvCategory.text = categoryName
            ivCategory.setImageResource(categoryImage)
        }
    }

    private fun clearAllCategory() {
        with(binding) {
            clearCategory(ivCategoryWarmindo)
            clearCategory(ivCategoryCafe)
            clearCategory(ivCategoryRestaurant)

        }
    }

    private fun clearCategory(
        binding: ItemCategoryBinding,
    ) {
        with(binding) {
            val colorSurface =
                requireContext().resolveAttributeColor(android.R.attr.colorBackground)

            root.strokeColor = ContextCompat.getColor(requireContext(), R.color.alto)
            root.setCardBackgroundColor(colorSurface)
            tvCategory.setTextColor(ContextCompat.getColor(requireContext(), R.color.slate_gray))
            ivCategory.setColorFilter(ContextCompat.getColor(requireContext(), R.color.slate_gray))
        }
    }

    private fun activatedCategory(
        binding: ItemCategoryBinding,
    ) {
        clearAllCategory()
        with(binding) {
            root.strokeColor = ContextCompat.getColor(requireContext(), R.color.primary)
            root.setCardBackgroundColor(ContextCompat.getColor(requireContext(), R.color.primary))
            tvCategory.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
            ivCategory.setColorFilter(ContextCompat.getColor(requireContext(), R.color.white))

            viewModel.filterTouristAttraction(tvCategory.text.toString())
        }
    }

    private fun navigateToDetail(item: Makan) {
        currentLocation?.let {
            val intent = Intent(
                requireContext(),
                DetailActivity::class.java
            ).putExtra(DetailActivity.EXTRA_TOURIST_ATTRACTION, item)
                .putExtra(DetailActivity.EXTRA_LATITUDE, it.latitude)
                .putExtra(DetailActivity.EXTRA_LONGITUDE, it.longitude)
            startActivity(intent)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
