package com.scrazy.ey.service.csdn;

import java.util.List;

import org.springframework.stereotype.Service;
import com.scrazy.ey.entity.csdn.CsdnColumnCategory;
import com.scrazy.ey.entity.csdn.CsdnColumnProfile;

public interface CsdnColProfileService {
	public void InsertMoreItem(List<CsdnColumnProfile> list);
}
