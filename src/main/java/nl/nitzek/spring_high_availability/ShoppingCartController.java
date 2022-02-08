package nl.nitzek.spring_high_availability;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingCartController
{
	private final ItemService itemService;

	public ShoppingCartController(ItemService itemService)
	{
		this.itemService = itemService;
	}

	@GetMapping(path = "/items/{item}")
	public Item get(@PathVariable("item") Long itemId)
	{
		return itemService.getItem(null);
	}

}
