package mate.service;

import java.util.Optional;
import mate.exception.AuthenticationException;
import mate.lib.Inject;
import mate.lib.Service;
import mate.model.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final Logger logger = LogManager.getLogger(AuthenticationServiceImpl.class);
    @Inject
    private DriverService driverService;

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        Optional<Driver> optionalDriver = driverService.findByLogin(login);
        if (optionalDriver.isPresent() && optionalDriver.get().getPassword().equals(password)) {
            logger.info("User entered with login: " + login);
            return optionalDriver.get();
        }
        logger.info("User tried to login with login: " + login);
        throw new AuthenticationException("Login or password are wrong!");
    }
}
