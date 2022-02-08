package nl.nitzek.spring_high_availability;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController
{
	private final ItemService itemService;

	public ItemController(ItemService itemService)
	{
		this.itemService = itemService;
	}

	@GetMapping(path = "/items/{item}")
	public Item get(@PathVariable("item") String itemName)
	{
		return itemService.getItem(itemName);
	}
}
