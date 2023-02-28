package us.crazycrew.crazyauctions.api.economy.vault;

import us.crazycrew.crazyauctions.CrazyAuctions;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.plugin.RegisteredServiceProvider;

/**
 * @author RyderBelserion
 * @author BadBones69
 *
 * Created: 2/18/2023
 * Time: Unknown
 * Last Edited: 2/28/2023 @ 3:04 AM
 *
 * Description: Vault support related code.
 */
public class VaultSupport {

    private final CrazyAuctions plugin = CrazyAuctions.getPlugin();

    private Economy vault = null;

    public Economy getVault() {
        return vault;
    }

    public void loadVault() {
        RegisteredServiceProvider<Economy> serviceProvider = plugin.getServer().getServicesManager().getRegistration(Economy.class);

        if (serviceProvider != null) vault = serviceProvider.getProvider();
    }
}